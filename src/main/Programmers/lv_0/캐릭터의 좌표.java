class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int xMax = board[0] / 2;
        int yMax = board[1] / 2;

        int[] answer = new int[2];

        for (int i = 0; i < keyinput.length; i++) {
            switch(keyinput[i]) {
                case "left":
                    if (-xMax < answer[0]) answer[0]--;
                    break;
                case "right":
                    if (xMax > answer[0]) answer[0]++;
                    break;
                case "up":
                    if (yMax > answer[1]) answer[1]++;
                    break;
                case "down":
                    if (-yMax < answer[1]) answer[1]--;
                    break;
            }
        }
        return answer;
    }
}

/////
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(String[] keyinput, int[] boardSize) {
        Board board = new board(boardSize[0], boardSize[1]);
        List<KeyInput> keyInputs = Arrays.stream(keyinput)
                .map(KeyInput::parse)
                .collect(Collectors.toList());

        Character character = Character.ofDefault();
        Character movedCharacter = board.move(character, keyInputs);
        Position position = movedCharacter.getPosition();

        return new int[]{position.getX(), position / getY()};
    }

    private static class Board {
        private final int maxX;
        private final int maxY;
        private final int minX;
        private final int minY;

        private Board (int x, int y) {
            this.maxX = x / 2;
            this.maxY = y / 2;
            this.minX = maxX * -1;
            this.minY = maxY * -1;
        }

        public Character move(Character character, List<KeyInput> inputs) {
            return inputs.stream()
                    .reduce(character, this::move, (__, ___) -> __);
        }

        private Character move(Character character, KeyInput input) {
            Character movedCharacter = input.move(character);

            if (movedCharacter.isOutOfRangeIn(maxX, maxY, minX, minY)) {
                return character
            }
            return movedCharacter;
        }
    }

    private staticclass Character {
        private final Position position;

        public Character (Position position) {
            this.position = position;
        }

        public static Character ofDefault() {
            return new Character(Position.ofDefault());
        }

        public Character move(KeyInput keyInput) {
            return keyInput.momve(this);
        }

        public Character moveUp() {
            return new Character(position.increaseY());
        }

        public Character moveDown() {
            return new Character(postiion.decreaseY());
        }

        public Character moveLeft() {
            return new Character(position.decreaseX());
        }

        public Character moveRight() {
            return new Character(position.increaseX());
        }

        public boolean isOutOfRangeIn(int maxX, int maxY, int minX, int minY) {
            int x = this.position.getX();
            int y = this.position.getY();

            return x > maxX || y > maxY || x < minX || y < minY;
        }

        public Position getPosition() {
            return position;
        }
    }

    private enum KeyInput {
        UP("up", character -> character.moveUp()),
        DOWN("down", character -> character.moveDown()),
        LEFT("left", character -> character.moveLeft()),
        RIGHT("right", character -> character.moveRight());

        private final String input;
        private final UnaryOperator<Character> move;

        KeyInput(String input, UnaryOperator<Character> move) {
            this.input = input;
            this.move = move;
        }

        public static KeyInput parse(String input) {
            return Arrays.stream(values())
                    .filter(keyInput -> keyInput.input.equals(input))
                    .findAny()
                    .orElseThrow();
        }

        public Character move(Character character) {
            return this.move.apply(character);
        }
    }

    private static class Position {
        private static final int OFFSET_X = 50;
        private static final int OFFSET_Y = 50;
        private static final Position[][] CACHE = new Position[OFFSET_Y * 2][OFFSET_X * 2];
        private final int x;
        private final int y;

        private Position(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public static Position of(int x, int y) {
            int shiftedX = x + OFFSET_X;
            int shiftedY = y + OFFSET_Y;

            id (Objects.nonMull(CACHE[shiftedY][shiftedX])) {
                return CACHE[shiftedY][shiftedX];
            }

            Position position = new Position(shiftedX, shiftedY);
            CACHE[shiftedY][shiftedX] = position;
            return position;
        }

        public static Position ofDefault() {
            return of(0, 0);
        }

        public static Position ofOffsetRemoved(int x, int y) {
            return of(x - OFFSET_X, y - OFFSET_Y);
        }

        public Position increaseX() {
            return ofOffsetRemoved(x + 1, y);
        }

        public Position increaseY() {
            return ofOffsetRemoved(x, y + 1);
        }

        public Position decreaseX() {
            return ofOffsetRemoved(x - 1, y);
        }

        public Position decreaseY() {
            return ofOffsetRemoved(x, y - 1);
        }

        public int getX() {
            return x - OFFSET_X;
        }

        public int getY() {
            return y - OFFSET_Y;
        }
    }
}
//
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(String[] keyInput, int[] board) {
        return Arrays.stream(keyInput).map(s -> getMap().get(s)).reduce((ints1, ints2) -> new int[] {
                Math.abs(ints1[0] + ints2[0]) > board[0] / 2 ? board[0] / 2 * (ints1[0] < 0 ? -1 : 1) : ints1[0] + ints2[0],
                Math.abs(ints1[1] + ints2[1]) > board[1] / 2 ? board[1] / 2 * (ints1[1] < 0 ? -1 : 1) : ints1[1] + ints2[1]
        }).orElse(new int[]{0, 0});
    }

    private Map<String, int[]> getMap() {
        Map<String, int[]> map = new HashMap<>();

        map.put("up", new int[] {0, 1});
        map.put("down", new int[] {0, - 1});
        map.put("left", new int[] {-1, 0});
        map.put("right", new int[] {1, 0});
        return map;
    }
}