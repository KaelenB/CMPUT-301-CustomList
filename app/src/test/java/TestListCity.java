import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class TestListCity {
    private CustomList list;

    @Before
    public void createList() {
        list = new CustomList(null, new ArrayList<>());
    }

    @Test
    /**
     * function to test addCity
     */
    public void addCityTest() {
        int listSize = list.getCount();
        list.addCity(new City("Halifax", "NS"));
        assertEquals(list.getCount(), listSize + 1);
    }

    @Test
    /**
     * function to test hasCity
     */
    public void hasCityTest() {
        City testCity = new City("Halifax", "NS");
        list.addCity(testCity);
        assertTrue(list.hasCity(testCity));
    }

    @Test
    public void deleteCityTest() {
        City testCity = new City("Halifax", "NS");
        list.addCity(testCity);
        assertTrue(list.hasCity(testCity));
        list.deleteCity(testCity);
        assertFalse(list.hasCity(testCity));
    }
}
