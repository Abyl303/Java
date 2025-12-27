public class Sol {
    public static int bishopThreatensPawn(int bishopX, int bishopY, int pawnX, int pawnY) {
        if (Math.abs(bishopX - pawnX) == Math.abs(bishopY - pawnY)) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int result = bishopThreatensPawn(4, 4, 6, 6);
        System.out.println("Угрожает ли слон пешке? " + (result == 1 ? "Да" : "Нет"));
    }
}
