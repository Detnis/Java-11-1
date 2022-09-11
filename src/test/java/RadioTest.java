import org.junit.jupiter.api.Test;

class RadioTest {

    @Test
    public void nextToMax() {
        Radio rad = new Radio(10);
        rad.setCurrentStation(8);
        rad.next();
        assertEquals();
    }

    private void assertEquals() {
    }


    @Test
    public void setInvalidStation() {
        Radio rad = new Radio(10);
        rad.setCurrentStation(-1);
        assertEquals();
    }

    @Test
    public void nextToOverToFirstStation() {
        Radio rad = new Radio(10);
        rad.setCurrentStation(9);
        rad.next();
        assertEquals();
    }

    @Test
    public void nextWithInvalidNumberOfStation() {
        Radio rad = new Radio(10);
        rad.setCurrentStation(-2);
        assertEquals();
    }

    @Test
    public void nextFromFirstToLastStation() {
        Radio rad = new Radio(10);
        rad.setCurrentStation(8);
        rad.next();
        assertEquals();
    }

    @Test
    public void nextFromNineToZeroStation() {
        Radio rad = new Radio(10);
        rad.setCurrentStation(9);
        rad.next();
        assertEquals();
    }

    @Test
    public void prevToFirstStation() {
        Radio rad = new Radio(10);
        rad.setCurrentStation(1);
        rad.prev();
        assertEquals();
    }

    @Test
    public void prevFromFirstToLastStation() {
        Radio rad = new Radio(10);
        rad.setCurrentStation(0);
        rad.prev();
        assertEquals();
    }

    @Test
    public void prevFromSecondToFirstStation() {
        Radio rad = new Radio(10);
        rad.setCurrentStation(-1);
        rad.prev();
        assertEquals();
    }

    @Test
    public void prevFromOneToZeroStation() {
        Radio rad = new Radio(10);
        rad.setCurrentStation(1);
        rad.prev();
        assertEquals();
    }

    @Test
    public void increaseVolumeForOne() {
        Radio rad = new Radio(10);
        rad.increaseVolume();
        assertEquals();
    }

    @Test
    public void increaseVolumeToNine() {
        Radio rad = new Radio(10);
        rad.setCurrentVolume(8);
        rad.increaseVolume();
        assertEquals();
    }

    @Test
    public void increaseVolumeToMax() {
        Radio rad = new Radio(10);
        rad.setCurrentVolume(9);
        rad.increaseVolume();
        assertEquals();
    }

    @Test
    public void increaseVolumeOverThanMax() {
        Radio rad = new Radio(10);
        rad.setCurrentVolume(100);
        rad.increaseVolume();
        assertEquals();
    }

    @Test
    public void reduceVolumeToOne() {
        Radio rad = new Radio(10);
        rad.setCurrentVolume(2);
        rad.reduceVolume();
        assertEquals();
    }

    @Test
    public void reduceVolumeFromZero() {
        Radio rad = new Radio(10);
        rad.reduceVolume();
        assertEquals();
    }

    @Test
    public void reduceVolumeToNinetyNine() {
        Radio rad = new Radio(10);
        rad.setCurrentVolume(100);
        rad.reduceVolume();
        assertEquals();
    }

    @Test
    public void SetInvalidVolumeOverThanLimit() {
        Radio rad = new Radio(10);
        rad.setCurrentVolume(1002);
        assertEquals();
    }

    @Test
    public void SetInvalidVolumeBeforeThanLimit() {
        Radio rad = new Radio(10);
        rad.setCurrentVolume(-1);
        assertEquals();
    }

    @Test
    public void emptyConstructor() {
        Radio rad = new Radio();
        rad.setCurrentStation(100);
        assertEquals();
    }

    @Test
    public void setStationWithTwentyStations() {
        Radio rad = new Radio(20);
        rad.setCurrentStation(15);
        assertEquals();

    }

    @Test
    public void setStationAndNextWithTwentyStations() {
        Radio rad = new Radio(20);
        rad.setCurrentStation(15);
        rad.next();
        assertEquals();

    }


}
