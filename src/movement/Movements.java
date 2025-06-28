package movement;

public class Movements {
    private int x = 0;
    private int y = 0;
    private String[] directions = {"North", "East", "South", "West"};

    public String transDirections(String key){
        key = key.toLowerCase();
        String keyMove = null;

        switch (key){
            case "w":
                keyMove = directions[0];
                break;
            case "s":
                keyMove = directions[2];
                break;
            case "d":
                keyMove = directions[1];
                break;
            case "a":
                keyMove = directions[3];
                break;
            default:
                throw new AssertionError();

        }

        return keyMove;
    }

    public String coordenadas(String directionMove){
        
        switch (directionMove) {
            case "North":
                y++;
                northMove(y);
                break;
            case "South":
                y--;
                southMove(y);
                break;
            case "East":
                x++;
                eastMove(x);
                break;
            case "West":
                x--;
                westMove(x);
                break;
            default:
                throw new AssertionError();
        }
        return "Ubicacion: " + x + ", " + y;

    }


    public void northMove(int yCoordenate){
        System.out.println("El objeto se movio al norte.");
    }

    public void southMove(int yCoordenate){
        System.out.println("El objeto se movio al sur.");
    }
    
    public void eastMove(int xCoordenate){
        System.out.println("El objeto se movio al este.");
    }

    public void westMove(int xCoordenate){
        System.out.println("El objeto se movio al oeste.");
    }
}
