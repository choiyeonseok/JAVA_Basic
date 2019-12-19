package domain;

class Row {
    private Node[] nodes;

    Row(NaturalNumber noOfPersons){
        nodes = new Node[noOfPersons.getNumber()];
        for (int i = 0; i <nodes.length; i++) {
            nodes[i] = Node.createCenterNode();
        }
    }

    void drawLine(NaturalNumber startPosition) {
        int startIndex = startPosition.toArrayIndex();
        if (startIndex >= nodes.length - 1) {
            throw new IllegalArgumentException(String.format("시작 점은 %d미만이어야 합니다. 현재 값은 : %d", nodes.length - 1, startIndex));
        }
        if (nodes[startIndex].equals(Node.createLeftNode())){
            throw new IllegalArgumentException("선을 그을 수 없는 위치 입니다. ");
        }
        nodes[startIndex].changeRight();
        nodes[startIndex + 1].changeLeft();
    }

    Marker move(Marker marker) {
        return nodes[marker.toArrayIndex()].move(marker);
    }
}
