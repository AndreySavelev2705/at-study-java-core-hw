package homeworks.homework_7.task_3;

import homeworks.homework_7.task_3.chess.Player;
import homeworks.homework_7.task_3.chess.Position;
import homeworks.homework_7.task_3.figures.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Application {

    public static void main(String[] args) {
        List<ChessFigure> figures = new ArrayList<>();
        figures.add(new King(Player.WHITE, "B3"));
        figures.add(new Queen(Player.WHITE, "A1"));
        figures.add(new Rook(Player.WHITE, "G5"));
        figures.add(new Knight(Player.WHITE, "F5"));
        figures.add(new Bishop(Player.WHITE, "F5"));
        figures.add(new Pawn(Player.BLACK, "F6"));

        for (ChessFigure figure : figures)
            printMoves(figure);

    }

    private static void printMoves(ChessFigure figure) {
        Set<Position> positions = figure.getAvailableMoves();
        StringBuilder sb = new StringBuilder(figure.getFigureType())
                .append(" (").append(figure.getPosition()).append("):");
        Iterator<Position> iterator = positions.iterator();
        while (iterator.hasNext()) {
            Position position = iterator.next();
            sb.append(", ").append(position.getPosition());
        }
        System.out.println(sb.toString().replaceFirst(",", ""));
    }

}
