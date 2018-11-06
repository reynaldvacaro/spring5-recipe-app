package guru.springframework.domain;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Lenovo on 06/11/2018.
 */
public class CategoryTest {

    Category category;

    @org.junit.Before
    public void setUp() {
        category = new Category();
    }

    @Test
    public void getId() throws Exception {
        Long idValue = 4L;
        category.setId(idValue);

        Assert.assertEquals(idValue, category.getId());
    }

    @Test
    public void getDescription() throws Exception {

    }

    @Test
    public void getRecipes() throws Exception {

    }
}
