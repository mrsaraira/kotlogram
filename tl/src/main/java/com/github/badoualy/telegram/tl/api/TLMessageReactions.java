package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.TLContext;
import com.github.badoualy.telegram.tl.core.TLObject;
import com.github.badoualy.telegram.tl.core.TLVector;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

public class TLMessageReactions extends TLObject {
    public static final int CONSTRUCTOR_ID = 0x87b6e36;

    protected int flags;

    protected boolean min;

    protected boolean canSeeList;

    protected TLVector<TLReactionCount> results;

    protected TLVector<TLMessageUserReaction> recentReactons;

    private final String _constructor = "messageReactions#87b6e36";

    public TLMessageReactions() {
    }

    public TLMessageReactions(boolean min, boolean canSeeList, TLVector<TLReactionCount> results, TLVector<TLMessageUserReaction> recentReactons) {
        this.min = min;
        this.canSeeList = canSeeList;
        this.results = results;
        this.recentReactons = recentReactons;
    }

    private void computeFlags() {
        flags = 0;
        flags = min ? (flags | 1) : (flags & ~1);
        flags = canSeeList ? (flags | 4) : (flags & ~4);
        flags = recentReactons != null ? (flags | 2) : (flags & ~2);
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        computeFlags();

        writeInt(flags, stream);
        writeTLVector(results, stream);
        if ((flags & 2) != 0) {
            if (recentReactons == null) throwNullFieldException("recentReactons", flags);
            writeTLVector(recentReactons, stream);
        }
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        flags = readInt(stream);
        min = (flags & 1) != 0;
        canSeeList = (flags & 4) != 0;
        results = readTLVector(stream, context);
        recentReactons = (flags & 2) != 0 ? readTLVector(stream, context) : null;
    }

    @Override
    public int computeSerializedSize() {
        computeFlags();

        int size = SIZE_CONSTRUCTOR_ID;
        size += SIZE_INT32;
        size += results.computeSerializedSize();
        if ((flags & 2) != 0) {
            if (recentReactons == null) throwNullFieldException("recentReactons", flags);
            size += recentReactons.computeSerializedSize();
        }
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

    public boolean getMin() {
        return min;
    }

    public void setMin(boolean min) {
        this.min = min;
    }

    public boolean getCanSeeList() {
        return canSeeList;
    }

    public void setCanSeeList(boolean canSeeList) {
        this.canSeeList = canSeeList;
    }

    public TLVector<TLReactionCount> getResults() {
        return results;
    }

    public void setResults(TLVector<TLReactionCount> results) {
        this.results = results;
    }

    public TLVector<TLMessageUserReaction> getRecentReactons() {
        return recentReactons;
    }

    public void setRecentReactons(TLVector<TLMessageUserReaction> recentReactons) {
        this.recentReactons = recentReactons;
    }
}
