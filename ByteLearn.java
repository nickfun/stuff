import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;

class ByteLearn {

    public static void main( String[] args ) {
        System.out.println("begin");
        ByteLearn bl = new ByteLearn();
        bl.exec();
        System.out.println("Done.");
    }

    public void exec() {
        ByteBuffer bb = ByteBuffer.allocate(4);
        bb.putInt(0x04aa);
        System.out.println("bb is "+ bb.getInt());
    }
}

