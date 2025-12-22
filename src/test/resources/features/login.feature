Feature: Login Feature

  Scenario: Login dengan data valid
    Given user membuka halaman login
    When user memasukkan username dan password yang benar
    Then user berhasil login

  Scenario: Login dengan data tidak valid
    Given user membuka halaman login
    When user memasukkan username dan password yang salah
    Then muncul pesan error
