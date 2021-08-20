package homeworks.homework_7.task_3.figures;

import homeworks.homework_7.task_3.chess.Chess;
import homeworks.homework_7.task_3.chess.Player;
import homeworks.homework_7.task_3.chess.Position;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Queen extends ChessFigure {

    public Queen(Player player, String position) {
        super(player, position);
        figureType = "Ферзь";
    }

    @Override
    public Set<Position> getAvailableMoves() {
        Set<Position> availableMoves = new HashSet<>();
        Iterator<Position> iterator = Chess.allField().iterator();
        while (iterator.hasNext()) {
            Position candidate = iterator.next();
            // Ферзь может ходить прямой и по диагонали
            int dx = Math.abs(candidate.getHorizontal() - position.getHorizontal());
            int dy = Math.abs(candidate.getVertical() - position.getVertical());
            if (dx == 0 && dy == 0) continue;
            if (dx == 0 || dy == 0 || dx == dy)
                availableMoves.add(candidate);
        }
        return availableMoves;
    }
}
