package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.TLContext;
import com.github.badoualy.telegram.tl.core.TLObject;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

public class TLPeerSettings extends TLObject {
    public static final int CONSTRUCTOR_ID = 0xa518110d;

    protected int flags;

    protected boolean reportSpam;

    protected boolean addContact;

    protected boolean blockContact;

    protected boolean shareContact;

    protected boolean needContactsException;

    protected boolean reportGeo;

    protected boolean autoarchived;

    protected boolean inviteMembers;

    protected boolean requestChatBroadcast;

    protected Integer geoDistance;

    protected String requestChatTitle;

    protected Integer requestChatDate;

    private final String _constructor = "peerSettings#a518110d";

    public TLPeerSettings() {
    }

    public TLPeerSettings(boolean reportSpam, boolean addContact, boolean blockContact, boolean shareContact, boolean needContactsException, boolean reportGeo, boolean autoarchived, boolean inviteMembers, boolean requestChatBroadcast, Integer geoDistance, String requestChatTitle, Integer requestChatDate) {
        this.reportSpam = reportSpam;
        this.addContact = addContact;
        this.blockContact = blockContact;
        this.shareContact = shareContact;
        this.needContactsException = needContactsException;
        this.reportGeo = reportGeo;
        this.autoarchived = autoarchived;
        this.inviteMembers = inviteMembers;
        this.requestChatBroadcast = requestChatBroadcast;
        this.geoDistance = geoDistance;
        this.requestChatTitle = requestChatTitle;
        this.requestChatDate = requestChatDate;
    }

    private void computeFlags() {
        flags = 0;
        flags = reportSpam ? (flags | 1) : (flags & ~1);
        flags = addContact ? (flags | 2) : (flags & ~2);
        flags = blockContact ? (flags | 4) : (flags & ~4);
        flags = shareContact ? (flags | 8) : (flags & ~8);
        flags = needContactsException ? (flags | 16) : (flags & ~16);
        flags = reportGeo ? (flags | 32) : (flags & ~32);
        flags = autoarchived ? (flags | 128) : (flags & ~128);
        flags = inviteMembers ? (flags | 256) : (flags & ~256);
        flags = requestChatBroadcast ? (flags | 1024) : (flags & ~1024);
        flags = geoDistance != null ? (flags | 64) : (flags & ~64);
        flags = requestChatTitle != null ? (flags | 512) : (flags & ~512);
        flags = requestChatDate != null ? (flags | 512) : (flags & ~512);
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        computeFlags();

        writeInt(flags, stream);
        if ((flags & 64) != 0) {
            if (geoDistance == null) throwNullFieldException("geoDistance", flags);
            writeInt(geoDistance, stream);
        }
        if ((flags & 512) != 0) {
            if (requestChatTitle == null) throwNullFieldException("requestChatTitle", flags);
            writeString(requestChatTitle, stream);
        }
        if ((flags & 512) != 0) {
            if (requestChatDate == null) throwNullFieldException("requestChatDate", flags);
            writeInt(requestChatDate, stream);
        }
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        flags = readInt(stream);
        reportSpam = (flags & 1) != 0;
        addContact = (flags & 2) != 0;
        blockContact = (flags & 4) != 0;
        shareContact = (flags & 8) != 0;
        needContactsException = (flags & 16) != 0;
        reportGeo = (flags & 32) != 0;
        autoarchived = (flags & 128) != 0;
        inviteMembers = (flags & 256) != 0;
        requestChatBroadcast = (flags & 1024) != 0;
        geoDistance = (flags & 64) != 0 ? readInt(stream) : null;
        requestChatTitle = (flags & 512) != 0 ? readTLString(stream) : null;
        requestChatDate = (flags & 512) != 0 ? readInt(stream) : null;
    }

    @Override
    public int computeSerializedSize() {
        computeFlags();

        int size = SIZE_CONSTRUCTOR_ID;
        size += SIZE_INT32;
        if ((flags & 64) != 0) {
            if (geoDistance == null) throwNullFieldException("geoDistance", flags);
            size += SIZE_INT32;
        }
        if ((flags & 512) != 0) {
            if (requestChatTitle == null) throwNullFieldException("requestChatTitle", flags);
            size += computeTLStringSerializedSize(requestChatTitle);
        }
        if ((flags & 512) != 0) {
            if (requestChatDate == null) throwNullFieldException("requestChatDate", flags);
            size += SIZE_INT32;
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

    public boolean getReportSpam() {
        return reportSpam;
    }

    public void setReportSpam(boolean reportSpam) {
        this.reportSpam = reportSpam;
    }

    public boolean getAddContact() {
        return addContact;
    }

    public void setAddContact(boolean addContact) {
        this.addContact = addContact;
    }

    public boolean getBlockContact() {
        return blockContact;
    }

    public void setBlockContact(boolean blockContact) {
        this.blockContact = blockContact;
    }

    public boolean getShareContact() {
        return shareContact;
    }

    public void setShareContact(boolean shareContact) {
        this.shareContact = shareContact;
    }

    public boolean getNeedContactsException() {
        return needContactsException;
    }

    public void setNeedContactsException(boolean needContactsException) {
        this.needContactsException = needContactsException;
    }

    public boolean getReportGeo() {
        return reportGeo;
    }

    public void setReportGeo(boolean reportGeo) {
        this.reportGeo = reportGeo;
    }

    public boolean getAutoarchived() {
        return autoarchived;
    }

    public void setAutoarchived(boolean autoarchived) {
        this.autoarchived = autoarchived;
    }

    public boolean getInviteMembers() {
        return inviteMembers;
    }

    public void setInviteMembers(boolean inviteMembers) {
        this.inviteMembers = inviteMembers;
    }

    public boolean getRequestChatBroadcast() {
        return requestChatBroadcast;
    }

    public void setRequestChatBroadcast(boolean requestChatBroadcast) {
        this.requestChatBroadcast = requestChatBroadcast;
    }

    public Integer getGeoDistance() {
        return geoDistance;
    }

    public void setGeoDistance(Integer geoDistance) {
        this.geoDistance = geoDistance;
    }

    public String getRequestChatTitle() {
        return requestChatTitle;
    }

    public void setRequestChatTitle(String requestChatTitle) {
        this.requestChatTitle = requestChatTitle;
    }

    public Integer getRequestChatDate() {
        return requestChatDate;
    }

    public void setRequestChatDate(Integer requestChatDate) {
        this.requestChatDate = requestChatDate;
    }
}
