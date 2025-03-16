class AlarmClock extends Thread {
    private volatile boolean running = true; // Volatile ensures visibility across threads

    public void run() {
        while (running) {
            System.out.println("⏰ Alarm ringing...");
            try {
                Thread.sleep(1000); // Wait for 1 second
            } catch (InterruptedException e) {
                System.out.println("Alarm Interrupted");
            }
        }
        System.out.println("⏹️ Alarm Stopped!");
    }

    public void stopAlarm() {
        running = false;
    }
}

public class ThreadTerminationExample {
    public static void main(String[] args) throws InterruptedException {
        AlarmClock alarm = new AlarmClock();
        alarm.start();  // Start the alarm

        Thread.sleep(5000); // Let the alarm ring for 5 seconds
        System.out.println("🔘 User turns off the alarm...");
        alarm.stopAlarm(); // Stop the alarm
    }
}
