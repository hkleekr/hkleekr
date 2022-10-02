//class Tv {
//    boolean power;                          // 전원상태(on/off)
//    int channel;                            // 채널
//
//    void power()       { power = !power; }
//    void channelUp()   { ++channel; }
//    void channelDown() { --channel; }
//}
//
//class CaptionTv extends Tv {
//    boolean caption;                        // 캡션상태(on/off)
//    void displayCaption(String text) {
//        if (caption) {                      // 캡션상태가 on일때만 text를 보여준다
//            System.out.println(text);
//        }
//    }
//}

//public class CaptionTvTest {
//    public static void main(String[] args) {
//        CaptionTv ctv = new CaptionTv();      // 객체 생성
//        ctv.channel = 10;                     // channel 10으로 초기화, 조상으로 부터 상속받은 멤버
//        ctv.channelUp();                      // channelUp, 조상으로 부터 상속받은 멤버
//        System.out.println(ctv.channel);      // 11
//        ctv.displayCaption("Hello, World");
//        ctv.caption = true;
//        ctv.displayCaption("Hello, World");
//    }
//}
