package project;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.PropertySource;
import project.Models.*;
import project.Savers.AbstractExtendedReportSaver;
import project.Savers.SimpleExtendedReportSaver;

import java.util.Map;


@PropertySource("classpath*:hibernate.cfg.xml")
public class Inserter {

    private SessionFactory sessionFactory;

    private SessionFactory initSessionFactory() {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(IncludeInList.class)
                .addAnnotatedClass(BankruptcyMessage.class)
                .addAnnotatedClass(BoardOfDirectors.class)
                .addAnnotatedClass(RegistrationCertificates.class)
                .addAnnotatedClass(SubmittedStatements.class)
                .addAnnotatedClass(Okved2List.class)
                .addAnnotatedClass(AdjustAddress.class)
                .addAnnotatedClass(PreviousAddress.class)
                .addAnnotatedClass(LegalAddresses.class)
                .addAnnotatedClass(ChangesInNameAndLegalForm.class)
                .addAnnotatedClass(FinPeriod.class)
                .addAnnotatedClass(FinStr.class)
                .addAnnotatedClass(ArbitrationCases.class)
                .addAnnotatedClass(ArbitrationCasesYear.class)
                .addAnnotatedClass(CompanyWithsameInfo.class)
                .addAnnotatedClass(CompanyWithsameInfoPhoneList.class)
                .addAnnotatedClass(LeaderList.class)
                .addAnnotatedClass(Disqualification.class)
                .addAnnotatedClass(EventsList.class)
                .addAnnotatedClass(ExecutiveBody.class)
                .addAnnotatedClass(ExecutiveBodyMember.class)
                .addAnnotatedClass(FederalTaxRegistrationCurrent.class)
                .addAnnotatedClass(FederalTaxRegistrationPayment.class)
                .addAnnotatedClass(PhoneList.class)
                .addAnnotatedClass(Regime.class)
                .addAnnotatedClass(SpecialTaxRegimes.class)
                .addAnnotatedClass(StructureInfo.class)
                .addAnnotatedClass(ExtendedReportModel.class)
                .addAnnotatedClass(ParsingXMLStat.class)
                .addAnnotatedClass(StaffNumberFTS.class)
                .buildSessionFactory();

        return sessionFactory;
    }


    public Inserter() {
        this.sessionFactory = initSessionFactory();
    }


    public void insert(Map<String, String> xmlFiles, Map<String, String> JSONhashes) {
        xmlFiles.entrySet()
                //При распараллеливании процессов происходят постоянные взаимные блокировки
                //Как пофиксить?
//                .parallelStream()
                .forEach(entry -> {
                    try {
                        AbstractExtendedReportSaver saver = new SimpleExtendedReportSaver(entry.getKey(), JSONhashes, entry.getValue(), sessionFactory.getCurrentSession());
                        saver.saveAll();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                });


    }

}
