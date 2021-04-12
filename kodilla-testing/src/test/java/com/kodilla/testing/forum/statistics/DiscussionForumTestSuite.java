package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class DiscussionForumTestSuite {

    private List<String> generateListOfNUsers(int usersQuantity) {
        List<String> resultList = new ArrayList<>();
        for (int n = 1; n <= usersQuantity; n++) {

            resultList.add("User " + n);
        }
        return resultList;
    }

    @Mock
    private Statistics statisticsMock;

    @Test
    void TestWithNoPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        DiscussionForum discussionForum = new DiscussionForum(statisticsMock);
        List<String> listOfUsers = generateListOfNUsers(1);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.usersNames()).thenReturn(listOfUsers);
        when(statisticsMock.commentsCount()).thenReturn(1);

        //When
        discussionForum.calculateAdvStatistics(statisticsMock);
        double expectedAvgNumberOfPosts = discussionForum.avgNumberOfPosts;
        double expectedAvgNumberOfCommentsInPost = discussionForum.avgNumberOfCommentsInPost;

        //Then
        assertEquals(0, expectedAvgNumberOfPosts);
        assertEquals(0, expectedAvgNumberOfCommentsInPost);
    }

    @Test
    void TestWithThousandPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        DiscussionForum discussionForum = new DiscussionForum(statisticsMock);
        List<String> listOfUsers = generateListOfNUsers(1);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.usersNames()).thenReturn(listOfUsers);
        when(statisticsMock.commentsCount()).thenReturn(1);
        //When
        discussionForum.calculateAdvStatistics(statisticsMock);
        double expectedAvgNumberOfPosts = discussionForum.avgNumberOfPosts;
        double expectedAvgNumberOfCommentsInPost = discussionForum.avgNumberOfCommentsInPost;
        //Then
        assertEquals(1000, expectedAvgNumberOfPosts);
        assertEquals(0.001, expectedAvgNumberOfCommentsInPost);
    }

    @Test
    void TestWithNoComments() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        DiscussionForum discussionForum = new DiscussionForum(statisticsMock);
        List<String> listOfUsers = generateListOfNUsers(1);
        when(statisticsMock.postsCount()).thenReturn(1);
        when(statisticsMock.usersNames()).thenReturn(listOfUsers);
        when(statisticsMock.commentsCount()).thenReturn(0);
        //When
        discussionForum.calculateAdvStatistics(statisticsMock);
        double expectedAvgNumberOfComments = discussionForum.avgNumberOfComments;
        double expectedAvgNumberOfCommentsInPost = discussionForum.avgNumberOfCommentsInPost;
        //Then
        assertEquals(0, expectedAvgNumberOfComments);
        assertEquals(0, expectedAvgNumberOfCommentsInPost);
    }

    @Test
    void TestWithMoreCommentsThanPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        DiscussionForum discussionForum = new DiscussionForum(statisticsMock);
        List<String> listOfUsers = generateListOfNUsers(1);
        when(statisticsMock.usersNames()).thenReturn(listOfUsers);
        when(statisticsMock.commentsCount()).thenReturn(110);
        when(statisticsMock.postsCount()).thenReturn(100);
        //When
        discussionForum.calculateAdvStatistics(statisticsMock);
        double expectedAvgNumberOfComments = discussionForum.avgNumberOfComments;
        double expectedAvgNumberOfCommentsInPost = discussionForum.avgNumberOfCommentsInPost;
        double expectedAvgNumberOfPosts = discussionForum.avgNumberOfPosts;
        //Then
        assertEquals(110, expectedAvgNumberOfComments);
        assertEquals(100, expectedAvgNumberOfPosts);
        assertEquals(1.1, expectedAvgNumberOfCommentsInPost);
    }
    @Test
    void TestWithMorePostsThanComments() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        DiscussionForum discussionForum = new DiscussionForum(statisticsMock);
        List<String> listOfUsers = generateListOfNUsers(1);
        when(statisticsMock.usersNames()).thenReturn(listOfUsers);
        when(statisticsMock.commentsCount()).thenReturn(100);
        when(statisticsMock.postsCount()).thenReturn(200);
        //When
        discussionForum.calculateAdvStatistics(statisticsMock);
        double expectedAvgNumberOfComments = discussionForum.avgNumberOfComments;
        double expectedAvgNumberOfCommentsInPost = discussionForum.avgNumberOfCommentsInPost;
        double expectedAvgNumberOfPosts = discussionForum.avgNumberOfPosts;
        //Then
        assertEquals(100, expectedAvgNumberOfComments);
        assertEquals(200, expectedAvgNumberOfPosts);
        assertEquals(0.5, expectedAvgNumberOfCommentsInPost);
    }

    @Test
    void TestWithNoUsers() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        DiscussionForum discussionForum = new DiscussionForum(statisticsMock);
        when(statisticsMock.commentsCount()).thenReturn(100);
        when(statisticsMock.postsCount()).thenReturn(200);
        //When
        discussionForum.calculateAdvStatistics(statisticsMock);
        double expectedAvgNumberOfComments = discussionForum.avgNumberOfComments;
        double expectedAvgNumberOfPosts = discussionForum.avgNumberOfPosts;
        //Then
        assertEquals(0, expectedAvgNumberOfComments);
        assertEquals(0, expectedAvgNumberOfPosts);
    }

    @Test
    void TestWithHundredUsers() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        DiscussionForum discussionForum = new DiscussionForum(statisticsMock);
        List<String> listOfUsers = generateListOfNUsers(100);
        when(statisticsMock.usersNames()).thenReturn(listOfUsers);
        when(statisticsMock.commentsCount()).thenReturn(100);
        when(statisticsMock.postsCount()).thenReturn(100);
        //When
        discussionForum.calculateAdvStatistics(statisticsMock);
        double expectedAvgNumberOfComments = discussionForum.avgNumberOfComments;
        double expectedAvgNumberOfPosts = discussionForum.avgNumberOfPosts;
        //Then
        assertEquals(1, expectedAvgNumberOfComments);
        assertEquals(1, expectedAvgNumberOfPosts);

    }
}
