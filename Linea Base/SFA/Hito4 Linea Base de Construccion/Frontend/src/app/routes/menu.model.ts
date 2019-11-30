export class Menu {
  text: string;
  heading?: boolean;
  link?: string;     // internal route links
  elink?: string;    // used only for external links
  target?: string;   // anchor target="_blank|_self|_parent|_top|framename"
  icon?: string;
  alert?: string;
  submenu?: Array<Menu>;
}
