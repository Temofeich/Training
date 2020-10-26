package AudioRecorder;

import com.dropbox.core.DbxRequestConfig;
import com.dropbox.core.v2.DbxClientV2;

import javax.sound.sampled.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class JavaSoundRecorder {
    private AudioFileFormat.Type fileType;
    private TargetDataLine line;
    private AudioFormat format;
    private DbxClientV2 client;
    private String fileName;

    public JavaSoundRecorder() {
        DbxRequestConfig config = DbxRequestConfig.newBuilder("dropbox/java-tutorial").build();
        String ACCESS_TOKEN = "CSVV217mb98AAAAAAAAAAYmwT2CgfteTlQvh08zOcrahxP713H3bl0n6LUJyktWJ";
        client = new DbxClientV2(config, ACCESS_TOKEN);
        fileType = AudioFileFormat.Type.WAVE;
        float sampleRate = 16000;
        int sampleSizeInBits = 8;
        int channels = 2;
        boolean signed = true;
        boolean bigEndian = true;
        format = new AudioFormat(sampleRate, sampleSizeInBits,
                channels, signed, bigEndian);
    }

    public void start(File file) {
        Thread thread = new Thread(() ->
        {
            try {
                DataLine.Info info =
                        new DataLine.Info(TargetDataLine.class, format);
                line = (TargetDataLine) AudioSystem.getLine(info);
                line.open(format);
                line.start();

                AudioInputStream ais = new AudioInputStream(line);
                AudioSystem.write(ais, fileType, file);
            } catch (LineUnavailableException | IOException ex) {
                ex.printStackTrace();
            }
        });
        thread.start();
    }

    public void stop(File file, int seconds) {
        Thread thread = new Thread(() ->
        {
            try {
                Thread.sleep(1000 * seconds);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            line.stop();
            line.close();

            try {
                InputStream in = new FileInputStream(file);
                client.files().uploadBuilder("/" + fileName + ".wav")
                        .uploadAndFinish(in);
            } catch (Exception e) {
                e.printStackTrace();
            }
            recordAudio(30);
        });
        thread.start();
    }

    public void recordAudio(int seconds) {
        Date dateNow = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
        fileName = formatForDateNow.format(dateNow);
        String filePath = "C:/Users/User/Desktop/" + fileName + "." + fileType.getExtension();
        File file = new File(filePath);
        start(file);
        stop(file, seconds);
    }
}