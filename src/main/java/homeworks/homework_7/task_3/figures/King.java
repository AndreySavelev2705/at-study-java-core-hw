package homeworks.homework_7.task_3.figures;

import homeworks.homework_7.task_3.chess.Chess;
import homeworks.homework_7.task_3.chess.Player;
import homeworks.homework_7.task_3.chess.Position;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class King extends ChessFigure {

    public King(Player player, String position) {
        super(player, position);
        figureType = "Король";
    }

    @Override
    public Set<Position> getAvailableMoves() {
        Set<Position> availableMoves = new HashSet<>();
        Iterator<Position> iterator = Chess.allField().iterator();
        while (iterator.hasNext()) {
            Position candidate = iterator.next();
            // Король может ходить на 1 клетку
            int dx = Math.abs(candidate.getHorizontal() - position.getHorizontal());
            int dy = Math.abs(candidate.getVertical() - position.getVertical());
            if ((dx == 1 || dy == 1) && (dx + dy <= 2))
                availableMoves.add(candidate);
        }
        return availableMoves;
    }
}
