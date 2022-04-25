package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.core.TLObject;

/**
 * Abstraction level for the following constructors:
 * <ul>
 * <li>{@link TLChannelParticipant}: channelParticipant#c00c07c0</li>
 * <li>{@link TLChannelParticipantAdmin}: channelParticipantAdmin#34c3bb53</li>
 * <li>{@link TLChannelParticipantBanned}: channelParticipantBanned#6df8014e</li>
 * <li>{@link TLChannelParticipantCreator}: channelParticipantCreator#2fe601d3</li>
 * <li>{@link TLChannelParticipantLeft}: channelParticipantLeft#1b03f006</li>
 * <li>{@link TLChannelParticipantSelf}: channelParticipantSelf#35a8bfa7</li>
 * </ul>
 *
 */
public abstract class TLAbsChannelParticipant extends TLObject {
    public TLAbsChannelParticipant() {
    }
}
