import javax.sound.midi.*;

public class MiniMiniMusicApp {
    public void play() {
        try{
            Sequencer player = MidiSystem.getSequencer(false);
            // open synthesizer
            player.open();
            Sequence seq = new Sequence(Sequence.PPQ, 4);
            Track track = seq.createTrack();
            MidiEvent event = null;
            ShortMessage a = new ShortMessage();
            a.setMessage(128, 1, 44, 100);
            MidiEvent noteOn = new MidiEvent(a, 1);
            track.add(noteOn);

            ShortMessage b= new ShortMessage();
            b.setMessage(128, 1, 44, 100);
            MidiEvent noteOff = new MidiEvent(b, 16);
            track.add(noteOff);

            player.setSequence(seq);
            Thread.sleep(5000);
            player.start();
            // new
            Thread.sleep(1000);
            player.close();
            System.exit(0);



        } catch(Exception ex) {
            ex.printStackTrace();
        }
       
    }
    public static void main(String[] args) {
        MiniMiniMusicApp mini = new MiniMiniMusicApp();
        mini.play();
    }
}