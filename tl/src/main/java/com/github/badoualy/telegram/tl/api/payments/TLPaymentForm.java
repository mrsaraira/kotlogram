package com.github.badoualy.telegram.tl.api.payments;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.TLContext;
import com.github.badoualy.telegram.tl.api.TLAbsUser;
import com.github.badoualy.telegram.tl.api.TLDataJSON;
import com.github.badoualy.telegram.tl.api.TLInvoice;
import com.github.badoualy.telegram.tl.api.TLPaymentRequestedInfo;
import com.github.badoualy.telegram.tl.api.TLPaymentSavedCredentialsCard;
import com.github.badoualy.telegram.tl.core.TLObject;
import com.github.badoualy.telegram.tl.core.TLVector;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

public class TLPaymentForm extends TLObject {
    public static final int CONSTRUCTOR_ID = 0x1694761b;

    protected int flags;

    protected boolean canSaveCredentials;

    protected boolean passwordMissing;

    protected long formId;

    protected long botId;

    protected TLInvoice invoice;

    protected long providerId;

    protected String url;

    protected String nativeProvider;

    protected TLDataJSON nativeParams;

    protected TLPaymentRequestedInfo savedInfo;

    protected TLPaymentSavedCredentialsCard savedCredentials;

    protected TLVector<TLAbsUser> users;

    private final String _constructor = "payments.paymentForm#1694761b";

    public TLPaymentForm() {
    }

    public TLPaymentForm(boolean canSaveCredentials, boolean passwordMissing, long formId, long botId, TLInvoice invoice, long providerId, String url, String nativeProvider, TLDataJSON nativeParams, TLPaymentRequestedInfo savedInfo, TLPaymentSavedCredentialsCard savedCredentials, TLVector<TLAbsUser> users) {
        this.canSaveCredentials = canSaveCredentials;
        this.passwordMissing = passwordMissing;
        this.formId = formId;
        this.botId = botId;
        this.invoice = invoice;
        this.providerId = providerId;
        this.url = url;
        this.nativeProvider = nativeProvider;
        this.nativeParams = nativeParams;
        this.savedInfo = savedInfo;
        this.savedCredentials = savedCredentials;
        this.users = users;
    }

    private void computeFlags() {
        flags = 0;
        flags = canSaveCredentials ? (flags | 4) : (flags & ~4);
        flags = passwordMissing ? (flags | 8) : (flags & ~8);
        flags = nativeProvider != null ? (flags | 16) : (flags & ~16);
        flags = nativeParams != null ? (flags | 16) : (flags & ~16);
        flags = savedInfo != null ? (flags | 1) : (flags & ~1);
        flags = savedCredentials != null ? (flags | 2) : (flags & ~2);
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        computeFlags();

        writeInt(flags, stream);
        writeLong(formId, stream);
        writeLong(botId, stream);
        writeTLObject(invoice, stream);
        writeLong(providerId, stream);
        writeString(url, stream);
        if ((flags & 16) != 0) {
            if (nativeProvider == null) throwNullFieldException("nativeProvider", flags);
            writeString(nativeProvider, stream);
        }
        if ((flags & 16) != 0) {
            if (nativeParams == null) throwNullFieldException("nativeParams", flags);
            writeTLObject(nativeParams, stream);
        }
        if ((flags & 1) != 0) {
            if (savedInfo == null) throwNullFieldException("savedInfo", flags);
            writeTLObject(savedInfo, stream);
        }
        if ((flags & 2) != 0) {
            if (savedCredentials == null) throwNullFieldException("savedCredentials", flags);
            writeTLObject(savedCredentials, stream);
        }
        writeTLVector(users, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        flags = readInt(stream);
        canSaveCredentials = (flags & 4) != 0;
        passwordMissing = (flags & 8) != 0;
        formId = readLong(stream);
        botId = readLong(stream);
        invoice = readTLObject(stream, context, TLInvoice.class, TLInvoice.CONSTRUCTOR_ID);
        providerId = readLong(stream);
        url = readTLString(stream);
        nativeProvider = (flags & 16) != 0 ? readTLString(stream) : null;
        nativeParams = (flags & 16) != 0 ? readTLObject(stream, context, TLDataJSON.class, TLDataJSON.CONSTRUCTOR_ID) : null;
        savedInfo = (flags & 1) != 0 ? readTLObject(stream, context, TLPaymentRequestedInfo.class, TLPaymentRequestedInfo.CONSTRUCTOR_ID) : null;
        savedCredentials = (flags & 2) != 0 ? readTLObject(stream, context, TLPaymentSavedCredentialsCard.class, TLPaymentSavedCredentialsCard.CONSTRUCTOR_ID) : null;
        users = readTLVector(stream, context);
    }

    @Override
    public int computeSerializedSize() {
        computeFlags();

        int size = SIZE_CONSTRUCTOR_ID;
        size += SIZE_INT32;
        size += SIZE_INT64;
        size += SIZE_INT64;
        size += invoice.computeSerializedSize();
        size += SIZE_INT64;
        size += computeTLStringSerializedSize(url);
        if ((flags & 16) != 0) {
            if (nativeProvider == null) throwNullFieldException("nativeProvider", flags);
            size += computeTLStringSerializedSize(nativeProvider);
        }
        if ((flags & 16) != 0) {
            if (nativeParams == null) throwNullFieldException("nativeParams", flags);
            size += nativeParams.computeSerializedSize();
        }
        if ((flags & 1) != 0) {
            if (savedInfo == null) throwNullFieldException("savedInfo", flags);
            size += savedInfo.computeSerializedSize();
        }
        if ((flags & 2) != 0) {
            if (savedCredentials == null) throwNullFieldException("savedCredentials", flags);
            size += savedCredentials.computeSerializedSize();
        }
        size += users.computeSerializedSize();
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

    public boolean getCanSaveCredentials() {
        return canSaveCredentials;
    }

    public void setCanSaveCredentials(boolean canSaveCredentials) {
        this.canSaveCredentials = canSaveCredentials;
    }

    public boolean getPasswordMissing() {
        return passwordMissing;
    }

    public void setPasswordMissing(boolean passwordMissing) {
        this.passwordMissing = passwordMissing;
    }

    public long getFormId() {
        return formId;
    }

    public void setFormId(long formId) {
        this.formId = formId;
    }

    public long getBotId() {
        return botId;
    }

    public void setBotId(long botId) {
        this.botId = botId;
    }

    public TLInvoice getInvoice() {
        return invoice;
    }

    public void setInvoice(TLInvoice invoice) {
        this.invoice = invoice;
    }

    public long getProviderId() {
        return providerId;
    }

    public void setProviderId(long providerId) {
        this.providerId = providerId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getNativeProvider() {
        return nativeProvider;
    }

    public void setNativeProvider(String nativeProvider) {
        this.nativeProvider = nativeProvider;
    }

    public TLDataJSON getNativeParams() {
        return nativeParams;
    }

    public void setNativeParams(TLDataJSON nativeParams) {
        this.nativeParams = nativeParams;
    }

    public TLPaymentRequestedInfo getSavedInfo() {
        return savedInfo;
    }

    public void setSavedInfo(TLPaymentRequestedInfo savedInfo) {
        this.savedInfo = savedInfo;
    }

    public TLPaymentSavedCredentialsCard getSavedCredentials() {
        return savedCredentials;
    }

    public void setSavedCredentials(TLPaymentSavedCredentialsCard savedCredentials) {
        this.savedCredentials = savedCredentials;
    }

    public TLVector<TLAbsUser> getUsers() {
        return users;
    }

    public void setUsers(TLVector<TLAbsUser> users) {
        this.users = users;
    }
}
