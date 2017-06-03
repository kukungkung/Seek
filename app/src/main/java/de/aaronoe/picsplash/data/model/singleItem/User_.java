
package de.aaronoe.picsplash.data.model.singleItem;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class User_ implements Parcelable
{

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("portfolio_url")
    @Expose
    private String portfolioUrl;
    @SerializedName("bio")
    @Expose
    private String bio;
    @SerializedName("location")
    @Expose
    private String location;
    @SerializedName("total_likes")
    @Expose
    private Integer totalLikes;
    @SerializedName("total_photos")
    @Expose
    private Integer totalPhotos;
    @SerializedName("total_collections")
    @Expose
    private Integer totalCollections;
    @SerializedName("profile_image")
    @Expose
    private ProfileImage_ profileImage;
    @SerializedName("links")
    @Expose
    private Links___ links;
    public final static Parcelable.Creator<User_> CREATOR = new Creator<User_>() {


        @SuppressWarnings({
            "unchecked"
        })
        public User_ createFromParcel(Parcel in) {
            User_ instance = new User_();
            instance.id = ((String) in.readValue((String.class.getClassLoader())));
            instance.updatedAt = ((String) in.readValue((String.class.getClassLoader())));
            instance.username = ((String) in.readValue((String.class.getClassLoader())));
            instance.name = ((String) in.readValue((String.class.getClassLoader())));
            instance.portfolioUrl = ((String) in.readValue((String.class.getClassLoader())));
            instance.bio = ((String) in.readValue((String.class.getClassLoader())));
            instance.location = ((String) in.readValue((String.class.getClassLoader())));
            instance.totalLikes = ((Integer) in.readValue((Integer.class.getClassLoader())));
            instance.totalPhotos = ((Integer) in.readValue((Integer.class.getClassLoader())));
            instance.totalCollections = ((Integer) in.readValue((Integer.class.getClassLoader())));
            instance.profileImage = ((ProfileImage_) in.readValue((ProfileImage_.class.getClassLoader())));
            instance.links = ((Links___) in.readValue((Links___.class.getClassLoader())));
            return instance;
        }

        public User_[] newArray(int size) {
            return (new User_[size]);
        }

    }
    ;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPortfolioUrl() {
        return portfolioUrl;
    }

    public void setPortfolioUrl(String portfolioUrl) {
        this.portfolioUrl = portfolioUrl;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getTotalLikes() {
        return totalLikes;
    }

    public void setTotalLikes(Integer totalLikes) {
        this.totalLikes = totalLikes;
    }

    public Integer getTotalPhotos() {
        return totalPhotos;
    }

    public void setTotalPhotos(Integer totalPhotos) {
        this.totalPhotos = totalPhotos;
    }

    public Integer getTotalCollections() {
        return totalCollections;
    }

    public void setTotalCollections(Integer totalCollections) {
        this.totalCollections = totalCollections;
    }

    public ProfileImage_ getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(ProfileImage_ profileImage) {
        this.profileImage = profileImage;
    }

    public Links___ getLinks() {
        return links;
    }

    public void setLinks(Links___ links) {
        this.links = links;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(id);
        dest.writeValue(updatedAt);
        dest.writeValue(username);
        dest.writeValue(name);
        dest.writeValue(portfolioUrl);
        dest.writeValue(bio);
        dest.writeValue(location);
        dest.writeValue(totalLikes);
        dest.writeValue(totalPhotos);
        dest.writeValue(totalCollections);
        dest.writeValue(profileImage);
        dest.writeValue(links);
    }

    public int describeContents() {
        return  0;
    }

}
