class Solution {
    public static int videoSec;
    public static int startSec;
    public static int endSec;
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String[] videoStr = video_len.split(":");
        String[] posStr = pos.split(":");
        String[] startStr = op_start.split(":");
        String[] endStr = op_end.split(":");
        
        videoSec = 60 * Integer.parseInt(videoStr[0]) + Integer.parseInt(videoStr[1]);
        int posSec = 60 * Integer.parseInt(posStr[0]) + Integer.parseInt(posStr[1]);
        startSec = 60 * Integer.parseInt(startStr[0]) + Integer.parseInt(startStr[1]);
        endSec = 60 * Integer.parseInt(endStr[0]) + Integer.parseInt(endStr[1]);
        
        posSec = skipOp(posSec);
        
        for (String command : commands) {
            if (command.equals("prev")) {
                posSec = toPrev(posSec);
            } else {
                posSec = toNext(posSec);
            }
        }
        
        posSec = skipOp(posSec);
        String min = posSec / 60 < 10 ? "0" + posSec / 60 : "" + posSec / 60;
        String sec = posSec % 60 < 10 ? "0" + posSec % 60 : "" + posSec % 60;

        String answer = min + ":" + sec;
        
        return answer;
    }
    
    private int skipOp(int pos) {
        if (pos >= startSec && pos <= endSec)
            return endSec;
        else
            return pos;
    }
    
    private int toNext(int pos) {
        pos = skipOp(pos);
        
        pos += 10;
        if (pos >= videoSec)
            pos = videoSec;
        
        return pos;
    }
    
    private int toPrev(int pos) {
        pos = skipOp(pos);
        
        pos -= 10;
        if (pos <= 0)
            pos = 0;
        
        return pos;
    }
}