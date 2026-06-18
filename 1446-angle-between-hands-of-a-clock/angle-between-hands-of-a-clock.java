class Solution {
    public double angleClock(int hour, int minutes) {
        // Position of hour hand
        double hourAngle = (hour % 12) * 30 + minutes * 0.5;

        // Position of minute hand
        double minuteAngle = minutes * 6;

        // Difference between angles
        double angle = Math.abs(hourAngle - minuteAngle);

        // Return smaller angle
        return Math.min(angle, 360 - angle);
    }
}