package training;

public class IsPalindrome {


    public static boolean isPalindrome(String word) {
        String loweredWord = word.toLowerCase();
        int length = loweredWord.length();
        int forward = 0;
        int backward = length - 1;
        while (backward > forward) {
            char forwardChar = loweredWord.charAt(forward++);
            char backwardChar = loweredWord.charAt(backward--);
            if (forwardChar != backwardChar) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome2(String text) {
        String clean = text.replaceAll("\\s+", "").toLowerCase();
        int length = clean.length();
        int forward = 0;
        int backward = length - 1;
        while (backward > forward) {
            char forwardChar = clean.charAt(forward);
            char backwardChar = clean.charAt(backward);
            if (forwardChar != backwardChar)
                return false;
            ++forward;
            --backward;
        }
        System.out.println(length);
        return true;
    }

    /**
     * OW_COMPANY_INN, текст, 12 (ИНН компании)
     * OW_COMPANY_OGRN, текст, 15 (ОГРН компании)
     *
     * МАССИВ 30:
     * OW_MODULE_NAME, текст, 100 (Название модуля)
     * OW_MODULE_PD, число (10,5) (PD модуля)
     * OW_MODULE_FLG, текст, 1 (Флаг отработки модуля)
     *
     *МАССИВ 20:
     *  OW_MODEL_NAME, текст, 100 (Название модели)
     * OW_MODEL_SCORE, число (10,5) (Скор балл до калибровки и предсигналов)
     *
     *OW_MODEL_SCORE_PVR
     *
     * МАССИВ 20:
     * OW_WARNING_SIGNALS_NAME, текст, 100 (Название предсигнала)
     * OW_WARNING_SIGNALS_NUMBER, число (5,0) (Значение предсигнала)
     *
     * MSD_VALUE_DAY, дата - Дата расчета модельных значений LGD/EAD
     * MSD_DFT_FLAG, число (1) - Флаг наличия дефолта по клиенту
     *
     * МАССИВЫ ПО 20:
     * MSD_DEAL_ID, текст (40) - Номер кредитной сделки Equation
     * MSD_PROD_ID, текст (6) - Код продукта BI по сделке
     * MSD_DEAL_TYPE, текст (60) - Тип сделки в Loan Manager
     * MSD_TERM, число (5) - Срочность сделки, мес
     * MSD_BALANCE, дробь, длина 18, 2 знака после разделителя - Остаток долга (ОД + %), руб.
     * MSD_CREDIT_LIMIT, дробь, длина 18, 2 знака после разделителя - Текущий лимит, руб
     * MSD_LGD_PRED, текст (10) - Значение LGD до калибровки,%
     * MSD_LGD_PRED_BEST_ESTIMATE, текст (10) - Значение LGD скалиброванное на среднее по циклу,%
     * MSD_LGD_PRED_BEST_ESTIMATE_DOWNTURN, текст (10) - Значение LGD скалиброванное на среднее по циклу с учетом маржи консервативности,%
     * MSD_EAD_PRED, текст (20) - Оценка EAD до калибровки, руб
     * MSD_EAD_PRED_DOWNTURN, текст (20) - Оценка EAD с учетом маржи консервативности, руб
     */

    public static boolean palindrome(String text) {
        boolean result = true;
        String clean = text.replaceAll("\\s+", "").toLowerCase();
        int length = clean.length();
        int start = 0;
        int end = length - 1;
        while (end > start) {
            char startChar = clean.charAt(start++);
            char endChar = clean.charAt(end--);
            if (startChar != endChar){
                result = false;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(palindrome("шалаш шалаш"));
    }
}
