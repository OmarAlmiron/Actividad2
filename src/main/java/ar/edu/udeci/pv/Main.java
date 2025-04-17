package ar.edu.udeci.pv;

import org.apache.commons.cli.*;
import org.apache.log4j.Logger;

public class Main {
    final static Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        logger.info("Iniciando la aplicación");

        Options options = new Options();
        options.addOption("n", "name", true, "Tu nombre");

        CommandLineParser parser = new DefaultParser();
        try {
            CommandLine cmd = parser.parse(options, args);
            if (cmd.hasOption("name")) {
                System.out.println("Hola, " + cmd.getOptionValue("name") + "!");
                logger.info("Nombre recibido: " + cmd.getOptionValue("name"));
            } else {
                System.out.println("No se proporcionó un nombre.");
                logger.warn("No se proporcionó el argumento --name");
            }
        } catch (ParseException e) {
            logger.error("Error al procesar argumentos: " + e.getMessage());
        }
    }
}
