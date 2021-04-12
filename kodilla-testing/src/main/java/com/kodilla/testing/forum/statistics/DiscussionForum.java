package com.kodilla.testing.forum.statistics;

public class DiscussionForum {

    private Statistics statistics;

    public DiscussionForum(Statistics statistics) {
        this.statistics = statistics;
    }

    double numberOfUsers;
    double numberOfPosts;
    double numberOfComments;

    double avgNumberOfPosts;
    double avgNumberOfComments;
    double avgNumberOfCommentsInPost;

    public void calculateAdvStatistics(Statistics statistics){
        numberOfUsers = statistics.usersNames().size();
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();

        if (numberOfUsers > 0) {
            avgNumberOfPosts = numberOfPosts / numberOfUsers;
            avgNumberOfComments = numberOfComments / numberOfUsers;
        } else {
            avgNumberOfPosts = 0;
            avgNumberOfComments = 0;
        }
        if (numberOfPosts > 0) {
            avgNumberOfCommentsInPost = numberOfComments / numberOfPosts;
        } else {
            avgNumberOfCommentsInPost = 0;
        }
    }

    public void showStatistics(){
        System.out.println("Total number of users is: " + numberOfUsers);
        System.out.println("Total number of posts is: " + numberOfPosts);
        System.out.println("Total number of comments is: " + numberOfComments);

        System.out.println("Average number of posts per user is: " + avgNumberOfPosts);
        System.out.println("Average number of comments per user is: " + avgNumberOfComments);
        System.out.println("Average number of comments per post is: " + avgNumberOfCommentsInPost);
    }
}
