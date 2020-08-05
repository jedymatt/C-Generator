package main.java.lib;

public enum TransmutationTable {

    AVERAGE_100(100.0, 100.0),
    AVERAGE_99(98.4, 99.99),
    AVERAGE_98(96.8, 98.39),
    AVERAGE_97(95.2, 96.79),
    AVERAGE_96(93.6, 95.19),
    AVERAGE_95(92.0, 93.59),
    AVERAGE_94(90.4, 91.99),
    AVERAGE_93(88.8, 90.39),
    AVERAGE_92(87.2, 88.79),
    AVERAGE_91(85.6, 87.19),
    AVERAGE_90(84.0, 85.59),
    AVERAGE_89(82.4, 83.99),
    AVERAGE_88(80.8, 82.39),
    AVERAGE_87(79.2, 80.79),
    AVERAGE_86(77.6, 79.19),
    AVERAGE_85(76.0, 77.59),
    AVERAGE_84(74.4, 75.99),
    AVERAGE_83(72.8, 74.39),
    AVERAGE_82(71.2, 72.79),
    AVERAGE_81(69.6, 71.19),
    AVERAGE_80(68.0, 69.59),
    AVERAGE_79(66.4, 67.99),
    AVERAGE_78(64.8, 66.39),
    AVERAGE_77(63.2, 64.79),
    AVERAGE_76(61.6, 63.19),
    AVERAGE_75(60.0, 61.59),
    AVERAGE_74(56.0, 59.99),
    AVERAGE_73(52.0, 55.99),
    AVERAGE_72(48.0, 51.99),
    AVERAGE_71(44.0, 47.99),
    AVERAGE_70(40.0, 43.99),
    AVERAGE_69(36.0, 39.99),
    AVERAGE_68(32.0, 35.99),
    AVERAGE_67(28.0, 31.99),
    AVERAGE_66(24.0, 27.99),
    AVERAGE_65(20.0, 23.99),
    AVERAGE_64(16.0, 19.99),
    AVERAGE_63(12.0, 15.99),
    AVERAGE_62(8.0, 11.99),
    AVERAGE_61(4.0, 7.99),
    AVERAGE_60(0.0, 3.99);

    public double MIN_INITIAL;
    public double MAX_INITIAL;
    public int AVERAGE;

    private TransmutationTable(double MIN_INITIAL, double MAX_INITIAL) {
        this.MIN_INITIAL = MIN_INITIAL;
        this.MAX_INITIAL = MAX_INITIAL;
    }

    static TransmutationTable caseAverage(int AVERAGE) {
        switch (AVERAGE) {
            case 100:
                return AVERAGE_100;
            case 99:
                return AVERAGE_99;
            case 98:
                return AVERAGE_98;
            case 97:
                return AVERAGE_97;
            case 96:
                return AVERAGE_96;
            case 95:
                return AVERAGE_95;
            case 94:
                return AVERAGE_94;
            case 93:
                return AVERAGE_93;
            case 92:
                return AVERAGE_92;
            case 91:
                return AVERAGE_91;
            case 90:
                return AVERAGE_90;
            case 89:
                return AVERAGE_89;
            case 88:
                return AVERAGE_88;
            case 87:
                return AVERAGE_87;
            case 86:
                return AVERAGE_86;
            case 85:
                return AVERAGE_85;
            case 84:
                return AVERAGE_84;
            case 83:
                return AVERAGE_83;
            case 82:
                return AVERAGE_82;
            case 81:
                return AVERAGE_81;
            case 80:
                return AVERAGE_80;
            case 79:
                return AVERAGE_79;
            case 78:
                return AVERAGE_78;
            case 77:
                return AVERAGE_77;
            case 76:
                return AVERAGE_76;
            case 75:
                return AVERAGE_75;
            case 74:
                return AVERAGE_74;
            case 73:
                return AVERAGE_73;
            case 72:
                return AVERAGE_72;
            case 71:
                return AVERAGE_71;
            case 70:
                return AVERAGE_70;
            case 69:
                return AVERAGE_69;
            case 68:
                return AVERAGE_68;
            case 67:
                return AVERAGE_67;
            case 66:
                return AVERAGE_66;
            case 65:
                return AVERAGE_65;
            case 64:
                return AVERAGE_64;
            case 63:
                return AVERAGE_63;
            case 62:
                return AVERAGE_62;
            case 61:
                return AVERAGE_61;
            case 60:
                return AVERAGE_60;
            default:
                throw new NumberFormatException();
        }
    }

}