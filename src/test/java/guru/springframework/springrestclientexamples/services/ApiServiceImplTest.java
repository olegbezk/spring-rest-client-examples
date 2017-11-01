package guru.springframework.springrestclientexamples.services;

import guru.springframework.api.domain.User;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApiServiceImplTest {

    @Autowired
    private ApiService apiService;

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void getAllUsers() throws Exception {
        final List<User> allUsers = apiService.getAllUsers(3);

        assertEquals(4, allUsers.size());
    }

}