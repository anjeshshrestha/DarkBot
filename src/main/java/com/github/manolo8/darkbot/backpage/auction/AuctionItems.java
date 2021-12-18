package com.github.manolo8.darkbot.backpage.auction;

public class AuctionItems {

    protected enum AuctionType {
        HOUR,
        DAY,
        WEEK;
    }
    public AuctionType auctionType;
    protected String id, lootID, name, itemType;
    protected long highestBidderID, currentBid, ownBid, instantBuy;

    public AuctionType getAuctionType() {
        return auctionType;
    }

    public void setAuctionType(AuctionType type) {
        auctionType = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLootID() {
        return lootID;
    }

    public void setLootID(String lootID) {
        this.lootID = lootID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public long getHighestBidder() {
        return highestBidderID;
    }

    public void setHighestBidderId(long highestBidderId) {
        this.highestBidderID = highestBidderId;
    }

    public long getCurrentBid() {
        return currentBid;
    }

    public void setCurrentBid(long currentBid) {
        this.currentBid = currentBid;
    }

    public long getOwnBid() {
        return ownBid;
    }

    public void setOwnBid(long ownBid) {
        this.ownBid = ownBid;
    }

    public long getInstantBuy() {
        return instantBuy;
    }

    public void setInstantBuy(long instantBuy) {
        this.instantBuy = instantBuy;
    }

    @Override
    public String toString() {
        return "Auction Item{" +
                "auctionType=" + auctionType +
                "id=" + id +
                "lootID=" + lootID +
                "name=" + name +
                "itemType=" + itemType +
                "highestBidder=" + highestBidderID +
                "currentBid=" + currentBid +
                "ownBid=" + ownBid +
                "instant=" + instantBuy +
                "}";
    }
}
