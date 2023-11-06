package Question4_Lab03;

class Test {
    public static void main(String[] args) {
        IMessage music = new Music("love story","country");
        IMessage mobile = new Mobile("HuaWei","mate60");
        music.print();
        mobile.print();
    }
}