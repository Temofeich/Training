package AudioRecorder;
                   // запись аудио файла через микрофон и заливка его в Dropbox
public class Main
{
    public static void main(String[] args)
    {
        JavaSoundRecorder recorder = new JavaSoundRecorder();
        recorder.recordAudio(30);
    }
}