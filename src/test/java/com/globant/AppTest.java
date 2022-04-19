package com.globant;

import org.apache.log4j.Logger;
import org.testng.annotations.*;


/**
 * Unit test for simple App.
 */
public class AppTest
{
    private final Logger logger = Logger.getLogger("AppTest");

    @BeforeSuite(groups = {"group1", "group2"})
    public void verifyAccount(){
        logger.info("Poseer una cuenta en facebook y credenciales");
    }

    @BeforeTest(groups = {"group1", "group2"})
    public void loginPage(){
        logger.info("Ingresar a facebook con login");
    }

    @BeforeGroups(groups = {"group1", "group2"})
    public void goToProfilePage(){
        logger.info("Ir a a mi perfil");
    }

    @BeforeClass(groups = {"group1"})
    public void goToFriendList(){
        logger.info("Ir a seccion mis amigos");
    }

    @BeforeMethod(groups = {"group1"})
    public void selectFriendFromList(){
        logger.info("Seleccionar un amigo");
    }

    @BeforeMethod(groups = {"group2"})
    public void editProfile(){
        logger.info("editar perfil");
    }

    @Test(groups = {"group2"})
    public void changeProfilePicture(){
        logger.info("Se cambia foto de perfil");
    }

    @AfterMethod(groups = {"group2"})
    public void verifyProfilePictureChange(){
        logger.info("Se verifica el cambio de foto de perfil");
    }

    @Test(groups = {"group1"})
    public void deleteFriendFromList(){
        logger.info("Eliminando amigo deseado");
    }

    @AfterMethod(groups = {"group1"})
    public void verifyDeletedFriend(){
        logger.info("Se verifica el borrado del amigo");
    }

    @AfterClass(groups = {"group1", "group2"})
    public void logoutFromPage(){
        logger.info("Se desloguea de la pagina");
    }

    @AfterSuite(groups = {"group1", "group2"})
    public void logoutFromDriver(){
        logger.info("Se cierra el navegador");
    }
}
