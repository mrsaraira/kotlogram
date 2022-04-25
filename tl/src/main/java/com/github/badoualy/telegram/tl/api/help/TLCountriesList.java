package com.github.badoualy.telegram.tl.api.help;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.TLContext;
import com.github.badoualy.telegram.tl.core.TLVector;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

public class TLCountriesList extends TLAbsCountriesList {
    public static final int CONSTRUCTOR_ID = 0x87d0759e;

    protected TLVector<TLCountry> countries;

    protected int hash;

    private final String _constructor = "help.countriesList#87d0759e";

    public TLCountriesList() {
    }

    public TLCountriesList(TLVector<TLCountry> countries, int hash) {
        this.countries = countries;
        this.hash = hash;
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeTLVector(countries, stream);
        writeInt(hash, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        countries = readTLVector(stream, context);
        hash = readInt(stream);
    }

    @Override
    public int computeSerializedSize() {
        int size = SIZE_CONSTRUCTOR_ID;
        size += countries.computeSerializedSize();
        size += SIZE_INT32;
        return size;
    }

    @Override
    public String toString() {
        return _constructor;
    }

    @Override
    public int getConstructorId() {
        return CONSTRUCTOR_ID;
    }

    public TLVector<TLCountry> getCountries() {
        return countries;
    }

    public void setCountries(TLVector<TLCountry> countries) {
        this.countries = countries;
    }

    public int getHash() {
        return hash;
    }

    public void setHash(int hash) {
        this.hash = hash;
    }
}
