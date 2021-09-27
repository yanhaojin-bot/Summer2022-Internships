import java.util.*;
class StreamingSystem {

    public static HashMap<String, StreamerInfo> map;
    public static void solution(String commands) {
        map = new HashMap<>();
        String[] commandArray = commands.split(", ");
        int i = 0;
        while (i < commandArray.length) {
            String command = commandArray[i];
            switch (command) {
                case "StreamerOnline":
                    String name = commandArray[i + 1];
                    String view = commandArray[i + 2];
                    String category = commandArray[i + 3];
                    i += 4;
                    add(name, view, category);
                    
            }
        }

    }

    public static void add(String name, String view, String category) {
        int viewNum = Integer.parseInt(view);
        StreamerInfo streamerInfo = new StreamerInfo(viewNum, category);
        map.put(name, streamerInfo);
    }
    public static void main(String [] args) {
        solution("StreamerOnline, nugha, 75000, Fortnite");
    }
}


class StreamerInfo {
    private int view;
    private String category;
    public StreamerInfo(int view, String category) {
        this.view = view;
        this.category = category;
    }

    
}

