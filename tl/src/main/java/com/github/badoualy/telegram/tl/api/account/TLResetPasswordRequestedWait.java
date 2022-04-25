package com.github.badoualy.telegram.tl.api.account;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.TLContext;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

public class TLResetPasswordRequestedWait extends TLAbsResetPasswordResult {
    public static final int CONSTRUCTOR_ID = 0xe9effc7d;

    protected int untilDate;

    private final String _constructor = "account.resetPasswordRequestedWait#e9effc7d";

    public TLResetPasswordRequestedWait() {
    }

    public TLResetPasswordRequestedWait(int untilDate) {
        this.untilDate = untilDate;
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeInt(untilDate, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        untilDate = readInt(stream);
    }

    @Override
    public int computeSerializedSize() {
        int size = SIZE_CONSTRUCTOR_ID;
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

    public int getUntilDate() {
        return untilDate;
    }

    public void setUntilDate(int untilDate) {
        this.untilDate = untilDate;
    }
}
