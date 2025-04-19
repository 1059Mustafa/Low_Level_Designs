package BookMyShow;

import java.util.ArrayList;
import java.util.List;

public class Screen {
    int screenId;
    List<Seat> seat=new ArrayList<>();

    public int getScreenId() {
        return screenId;
    }

    public void setScreenId(int screenId) {
        this.screenId = screenId;
    }

    public List<Seat> getSeat() {
        return seat;
    }

    public void setSeat(List<Seat> seat) {
        this.seat = seat;
    }
}
