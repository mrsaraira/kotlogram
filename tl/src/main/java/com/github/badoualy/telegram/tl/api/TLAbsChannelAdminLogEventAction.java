package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.core.TLObject;

/**
 * Abstraction level for the following constructors:
 * <ul>
 * <li>{@link TLChannelAdminLogEventActionChangeAbout}: channelAdminLogEventActionChangeAbout#55188a2e</li>
 * <li>{@link TLChannelAdminLogEventActionChangeAvailableReactions}: channelAdminLogEventActionChangeAvailableReactions#9cf7f76a</li>
 * <li>{@link TLChannelAdminLogEventActionChangeHistoryTTL}: channelAdminLogEventActionChangeHistoryTTL#6e941a38</li>
 * <li>{@link TLChannelAdminLogEventActionChangeLinkedChat}: channelAdminLogEventActionChangeLinkedChat#50c7ac8</li>
 * <li>{@link TLChannelAdminLogEventActionChangeLocation}: channelAdminLogEventActionChangeLocation#e6b76ae</li>
 * <li>{@link TLChannelAdminLogEventActionChangePhoto}: channelAdminLogEventActionChangePhoto#434bd2af</li>
 * <li>{@link TLChannelAdminLogEventActionChangeStickerSet}: channelAdminLogEventActionChangeStickerSet#b1c3caa7</li>
 * <li>{@link TLChannelAdminLogEventActionChangeTitle}: channelAdminLogEventActionChangeTitle#e6dfb825</li>
 * <li>{@link TLChannelAdminLogEventActionChangeUsername}: channelAdminLogEventActionChangeUsername#6a4afc38</li>
 * <li>{@link TLChannelAdminLogEventActionDefaultBannedRights}: channelAdminLogEventActionDefaultBannedRights#2df5fc0a</li>
 * <li>{@link TLChannelAdminLogEventActionDeleteMessage}: channelAdminLogEventActionDeleteMessage#42e047bb</li>
 * <li>{@link TLChannelAdminLogEventActionDiscardGroupCall}: channelAdminLogEventActionDiscardGroupCall#db9f9140</li>
 * <li>{@link TLChannelAdminLogEventActionEditMessage}: channelAdminLogEventActionEditMessage#709b2405</li>
 * <li>{@link TLChannelAdminLogEventActionExportedInviteDelete}: channelAdminLogEventActionExportedInviteDelete#5a50fca4</li>
 * <li>{@link TLChannelAdminLogEventActionExportedInviteEdit}: channelAdminLogEventActionExportedInviteEdit#e90ebb59</li>
 * <li>{@link TLChannelAdminLogEventActionExportedInviteRevoke}: channelAdminLogEventActionExportedInviteRevoke#410a134e</li>
 * <li>{@link TLChannelAdminLogEventActionParticipantInvite}: channelAdminLogEventActionParticipantInvite#e31c34d8</li>
 * <li>{@link TLChannelAdminLogEventActionParticipantJoin}: channelAdminLogEventActionParticipantJoin#183040d3</li>
 * <li>{@link TLChannelAdminLogEventActionParticipantJoinByInvite}: channelAdminLogEventActionParticipantJoinByInvite#5cdada77</li>
 * <li>{@link TLChannelAdminLogEventActionParticipantJoinByRequest}: channelAdminLogEventActionParticipantJoinByRequest#afb6144a</li>
 * <li>{@link TLChannelAdminLogEventActionParticipantLeave}: channelAdminLogEventActionParticipantLeave#f89777f2</li>
 * <li>{@link TLChannelAdminLogEventActionParticipantMute}: channelAdminLogEventActionParticipantMute#f92424d2</li>
 * <li>{@link TLChannelAdminLogEventActionParticipantToggleAdmin}: channelAdminLogEventActionParticipantToggleAdmin#d5676710</li>
 * <li>{@link TLChannelAdminLogEventActionParticipantToggleBan}: channelAdminLogEventActionParticipantToggleBan#e6d83d7e</li>
 * <li>{@link TLChannelAdminLogEventActionParticipantUnmute}: channelAdminLogEventActionParticipantUnmute#e64429c0</li>
 * <li>{@link TLChannelAdminLogEventActionParticipantVolume}: channelAdminLogEventActionParticipantVolume#3e7f6847</li>
 * <li>{@link TLChannelAdminLogEventActionSendMessage}: channelAdminLogEventActionSendMessage#278f2868</li>
 * <li>{@link TLChannelAdminLogEventActionStartGroupCall}: channelAdminLogEventActionStartGroupCall#23209745</li>
 * <li>{@link TLChannelAdminLogEventActionStopPoll}: channelAdminLogEventActionStopPoll#8f079643</li>
 * <li>{@link TLChannelAdminLogEventActionToggleGroupCallSetting}: channelAdminLogEventActionToggleGroupCallSetting#56d6a247</li>
 * <li>{@link TLChannelAdminLogEventActionToggleInvites}: channelAdminLogEventActionToggleInvites#1b7907ae</li>
 * <li>{@link TLChannelAdminLogEventActionToggleNoForwards}: channelAdminLogEventActionToggleNoForwards#cb2ac766</li>
 * <li>{@link TLChannelAdminLogEventActionTogglePreHistoryHidden}: channelAdminLogEventActionTogglePreHistoryHidden#5f5c95f1</li>
 * <li>{@link TLChannelAdminLogEventActionToggleSignatures}: channelAdminLogEventActionToggleSignatures#26ae0971</li>
 * <li>{@link TLChannelAdminLogEventActionToggleSlowMode}: channelAdminLogEventActionToggleSlowMode#53909779</li>
 * <li>{@link TLChannelAdminLogEventActionUpdatePinned}: channelAdminLogEventActionUpdatePinned#e9e82c18</li>
 * </ul>
 *
 */
public abstract class TLAbsChannelAdminLogEventAction extends TLObject {
    public TLAbsChannelAdminLogEventAction() {
    }
}
