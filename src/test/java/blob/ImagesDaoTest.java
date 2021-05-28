/*package blob;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import org.flywaydb.core.Flyway;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import static org.junit.Assert.assertTrue;

public class ImagesDaoTest {

    private ImagesDao imagesDao;

    @Before
    public void init() {
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/employees?useUnicode=true");
        dataSource.setUser("employees");
        dataSource.setPassword("employees");

        Flyway flyway = new Flyway();
        flyway.setDataSource(dataSource);

        flyway.clean();
        flyway.migrate();

        imagesDao = new ImagesDao(dataSource);
    }

    @Test
    public void saveImage() throws IOException {
        imagesDao.saveImage("training360.gif",
                ImagesDaoTest.class.getResourceAsStream("/training360.gif"));

        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        try (InputStream is = imagesDao.getImageByName("training360.gif")) {
            is.transferTo(baos);
        }

        assertTrue("File size", baos.size() > 3000);
    }
}


 */