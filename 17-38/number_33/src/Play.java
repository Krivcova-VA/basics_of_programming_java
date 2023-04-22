public class Play {
    public static long funkGame(long pal, boolean tanyaStr) {
        if (pal == 1) { // если осталась 1 палочка, то игрок может взять только ее
            return tanyaStr ? 0 : 1; // если ход Тани - вернуть 0, иначе 1
        }
        if (pal % 2 == 0) { // если количество палочек четное
            if (tanyaStr) { // если ход Тани
                return funkGame(pal / 2, !tanyaStr); // Таня возьмет половину палочек
            } else { // если ход Саши
                if (pal == 2) { // если осталось 2 палочки, то Саша возьмет 1
                    return 1;
                } else {
                    return Math.max(funkGame(pal - 1, !tanyaStr), funkGame(pal / 2, !tanyaStr)); // Саша возьмет 1 или половину палочек, чтобы оставить меньшее количество палочек Тане
                }
            }
        } else { // если количество палочек нечетное
            return funkGame(pal - 1, !tanyaStr); // Таня берет 1 палочку, Саша будет играть с оставшимися
        }
    }
}
