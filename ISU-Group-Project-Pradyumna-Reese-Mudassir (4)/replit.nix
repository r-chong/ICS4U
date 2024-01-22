{ pkgs }: {
    deps = [
      pkgs.temurin-bin
        pkgs.graalvm17-ce
        pkgs.maven
        pkgs.replitPackages.jdt-language-server
        pkgs.replitPackages.java-debug
    ];
}