package uebung02;

import tools.IO;        // für Benutzereingaben
public class Music {
    static int kostenInCent(int inDownloads) {
        if ( inDownloads <= 5 )    return 0;
        if ( inDownloads <= 35 ) return ( inDownloads-5 )*20;
        return 600 + ( inDownloads-35 )*15;
    }

    public static void main(String[] args) {

        int downloads = IO.readInt("Anzahl Downloads (>=0): ");
        //
        System.out.println("Kosten = " + kostenInCent(downloads)/100.0 + " Euro" );
    }

}
