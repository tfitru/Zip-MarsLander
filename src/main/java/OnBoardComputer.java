public class OnBoardComputer implements BurnStream {

    @Override
    public int getNextBurn(DescentEvent status) {
            int burn = status.getVelocity() * status.getVelocity() / (2 * status.getAltitude()) + (int) 99.2;

            // Burn was only accounting for the rocket speed not the Gravity
        // The 99.2 adds to the burn of the rocket and accounts for gravity

        System.out.println(burn); /*hack!*/
        return burn;
    }
}
