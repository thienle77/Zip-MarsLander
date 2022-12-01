public class OnBoardComputer implements BurnStream {

    @Override
    public int getNextBurn(DescentEvent status) {
        int burn = 0;

        if (status.Altitude > 1) {
            burn = (status.Velocity * status.Velocity) / (2 / status.Altitude) + 100;

        } else {
            burn = 100;
        }

        System.out.println(burn); /*hack!*/
        return burn;
    }
    // if alt is greater than 1 then burn will be accelerated plus 100 to which will decrease velocity (speed)
    // otherwise burn maintains speed
}