import java.util.concurrent.TimeUnit;

public class PotokObnovl extends Thread {
    ChatController cc;

    public void run() {
        while (true) {
            try {
                TimeUnit.SECONDS.sleep(1);
                cc.obnovitChat();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
            public ChatController getCc () {
                return cc;
            }

            public void setCc (ChatController cc){
                this.cc = cc;

            }


}