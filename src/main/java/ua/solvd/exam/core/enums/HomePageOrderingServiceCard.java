package ua.solvd.exam.core.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@RequiredArgsConstructor
public enum HomePageOrderingServiceCard {
    MILITARY_TICKETS("Квитки для військових",
            "Оформлення квитків для військових, коли вільних місць у потягу не знайшлося.",
            "https://app.uz.gov.ua/storage/services/Wg8WFpIGKN.svg",
            "https://services.uz.gov.ua/military"),
    CLAIMING_REFUNDS("Претензійне повернення",
            "Повернення квитків через скасовані рейси та нещасні випадки.",
            "https://app.uz.gov.ua/storage/services/LcLuIISeG1.svg",
            "https://services.uz.gov.ua/ticket-return"),
    UZ_LOUNGE("UZ Lounge",
            "Комфортні місця, швидкісний інтернет і підзарядка гаджетів на Центральному вокзалі Києва.",
            "https://app.uz.gov.ua/storage/services/QQjvws2yr4.svg",
            "https://services.uz.gov.ua/lounge"),
    AUTO_WAGON("Вагон-автомобілевоз",
            "Вагон для подорожей з власним авто – для замовлення потрібен техпаспорт.",
            "https://app.uz.gov.ua/storage/services/HXYcYKLlQv.svg",
            "https://services.uz.gov.ua/avtomobilevoz"),
    GROUP_ORDERING("Групове замовлення",
            "Оформлення квитків для груп від 10 людей не пізніше ніж за 7 днів до відправлення потяга.",
            "https://app.uz.gov.ua/storage/services/LIPYBxmDj9.svg",
            "https://services.uz.gov.ua/group-order"),
    LOST_ITEMS_SEARCH("Пошук забутих речей",
            "Конфіденційний пошук і повернення речей, забутих у потягу чи на вокзалі.",
            "https://app.uz.gov.ua/storage/services/1zXw28sP96.svg",
            "https://services.uz.gov.ua/lost-and-found"),
    STATION_HELPER("Вокзальний помічник",
            "Супровід та допомога з багажем для маломобільних пасажирів і людей з інвалідністю.",
            "https://app.uz.gov.ua/storage/services/4T6zeYiQre.svg",
            "https://services.uz.gov.ua/zamovlennya-pomichnyka"),
    INCLUSIVE_WAGON("Інклюзивний вагон",
            "Комфортна подорож для людей з інвалідністю І групи, дітей з інвалідністю та їх супровідників.",
            "https://app.uz.gov.ua/storage/services/0E0kCuYwvC.svg",
            "https://services.uz.gov.ua/special-carriage"),
    ACCESSIBILITY_MAP("Мапа безбар’єрності",
            "Все про рівень доступності вокзалів України та наявні елементи безбар'єрності.",
            "https://app.uz.gov.ua/storage/services/lHbjzjfMg7.svg",
            "https://misto.lun.ua/uz"),
    CHILD_TICKETS("Квитки на Дитячу Залізницю",
            "Захоплива подорож містом для всієї родини.",
            "https://app.uz.gov.ua/storage/services/MU3GJXELRD.svg",
            "https://booking.uz.gov.ua/kids");

    private final String title;
    private final String description;
    private final String iconUrl;
    private final String redirectUrl;
}