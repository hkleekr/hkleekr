class TV {
    boolean power;
    int channel;

    void power()       { power = !power; }
    void channelUp()   { ++channel; }
    void channelDown() { --channel; }
}

class VCR {
    boolean power;
    int counter = 0;
    void power() { power = !power; }
    void play()  { /*내용생략*/}
    void stop()  { /*내용생략*/}
    void rew()   { /*내용생략*/}
    void ff()    { /*내용생략*/}
}

public class TVCR extends Tv {
    VCR vcr = new VCR();

    void play() {
        vcr.play();
    }

    void stop() {
        vcr.stop();
    }

    void rew() {
        vcr.rew();
    }

    void ff() {
        vcr.ff();
    }
}

// 자바는 다중상속을 허용하지 않기 때문에, Tv클래스를 상속 받고, VCR클래스를 포함시켰다. 그리고 VCR클래스의 메서드들을 참조변수로 호출한다.