package steps;

import io.cucumber.java.en.*;

public class LoginSteps {

    @Given("user membuka halaman login")
    public void bukaHalamanLogin() {
        System.out.println("Buka halaman login");
    }

    @When("user memasukkan username dan password yang benar")
    public void loginValid() {
        System.out.println("Input data valid");
    }

    @When("user memasukkan username dan password yang salah")
    public void loginInvalid() {
        System.out.println("Input data invalid");
    }

    @Then("user berhasil login")
    public void loginBerhasil() {
        System.out.println("Login berhasil");
    }

    @Then("muncul pesan error")
    public void munculError() {
        System.out.println("Pesan error muncul");
    }
}

