class PezDispenser {
    public final static int MAX_PEZ = 12;
    final private String characterName;
    private int pezCount;

    public PezDispenser(String name) {
        this.characterName = name;
        pezCount = 0;
    }

    public void fill() { fill(MAX_PEZ); }

    public void fill(int pezAmount) {
        if (pezCount + pezAmount <= 12) {
            pezCount += pezAmount;
        } else {
            System.out.println("Too many Pez!");
        }
    }

    public boolean dispense() {
        boolean wasDispensed = false;
        if (!isEmpty()) {
            pezCount--;
            wasDispensed = true;
        }
        return wasDispensed;
    }

    public boolean isEmpty() {
        return pezCount == 0;
    }

    public String getCharacterName() {
        return characterName;
    }

    public int getPezCount() {
        return pezCount;
    }

}

