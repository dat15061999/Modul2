package TestInterface;

public class KethuaInterface implements ViduInterface {
    @Override
    public double tinhphucap(double workday, int salaryday) {

        return workday *salaryday;
    }

    @Override
    public void thongtin(String name, String cccd, int bodyear) {

    }
}
