package com.example.seminar4;
import android.os.Parcel;
import android.os.Parcelable;



public class Magazin implements Parcelable {
    private String denumire;
    private int nrAngajati;
    private float suprafata;
    private String oras;
    private String tip;
    private boolean areParcare;
    private boolean nonStop;
    private float rating;

    public Magazin(String denumire, int nrAngajati, float suprafata, String oras,
                   String tip, boolean areParcare, boolean nonStop, float rating) {
        this.denumire = denumire;
        this.nrAngajati = nrAngajati;
        this.suprafata = suprafata;
        this.oras = oras;
        this.tip = tip;
        this.areParcare = areParcare;
        this.nonStop = nonStop;
        this.rating = rating;
    }

    protected Magazin(Parcel in) {
        denumire = in.readString();
        nrAngajati = in.readInt();
        suprafata = in.readFloat();
        oras = in.readString();
        tip = in.readString();
        areParcare = in.readByte() != 0;
        nonStop = in.readByte() != 0;
        rating = in.readFloat();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(denumire);
        dest.writeInt(nrAngajati);
        dest.writeFloat(suprafata);
        dest.writeString(oras);
        dest.writeString(tip);
        dest.writeByte((byte) (areParcare ? 1 : 0));
        dest.writeByte((byte) (nonStop ? 1 : 0));
        dest.writeFloat(rating);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Magazin> CREATOR = new Creator<Magazin>() {
        @Override
        public Magazin createFromParcel(Parcel in) {
            return new Magazin(in);
        }

        @Override
        public Magazin[] newArray(int size) {
            return new Magazin[size];
        }
    };

    public String getDenumire() {
        return denumire;
    }

    public int getNrAngajati() {
        return nrAngajati;
    }

    public float getSuprafata() {
        return suprafata;
    }

    public String getOras() {
        return oras;
    }

    public String getTip() {
        return tip;
    }

    public boolean isAreParcare() {
        return areParcare;
    }

    public boolean isNonStop() {
        return nonStop;
    }

    public float getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return denumire + ", " + nrAngajati + " angajati, " + suprafata + " mp, " + oras +
                ", " + tip + ", parcare: " + areParcare + ", non-stop: " + nonStop +
                ", rating: " + rating;
    }
}