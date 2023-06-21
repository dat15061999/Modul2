package TestInterface;

public class Text2 implements ViduInterface,ViduInterface2{
    @Override
    public double tinhphucap(double workday, int salaryday) {
        return workday*salaryday;
    }

    @Override
    public void thongtin(String name, String cccd, int bodyear) {

    }

    @Override
    public void xetthuong(int cccd, double doanhthu) {

    }
}
