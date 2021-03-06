package io.github.droidkaigi.confsched.model;

import com.github.gfx.android.orma.annotation.Column;
import com.github.gfx.android.orma.annotation.Table;
import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

@Parcel
@Table
public class Place {

    @Column(indexed = true)
    @SerializedName("id")
    public int id;

    @Column(indexed = true)
    @SerializedName("name")
    public String name;

    public Place() {
    }

}
